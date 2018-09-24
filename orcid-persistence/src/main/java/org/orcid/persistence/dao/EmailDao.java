package org.orcid.persistence.dao;

import java.util.List;

import org.orcid.persistence.jpa.entities.EmailEntity;

/**
 * 
 * @author Will Simpson
 * 
 */
public interface EmailDao extends GenericDao<EmailEntity, String> {

    boolean emailExists(String emailHash);
    
    EmailEntity findByEmail(String email);

    String findOrcidIdByEmailHash(String email);

    void updateEmail(String orcid, String email, boolean isCurrent, String visibility);

    void updatePrimary(String orcid, String primaryEmail);

    void addEmail(String orcid, String email, String emailHash, String visibility, String sourceId, String clientSourceId);      

    void removeEmail(String orcid, String email);
    
    @SuppressWarnings("rawtypes")
    List findIdByCaseInsensitiveEmail(List<String> emails);
    
    void addSourceToEmail(String sourceId, String email);
    
    boolean verifyEmail(String email);
    
    boolean isPrimaryEmailVerified(String orcid);
    
    boolean verifyPrimaryEmail(String orcid);
    
    boolean moveEmailToOtherAccountAsNonPrimary(String email, String origin, String destination);
    
    List<EmailEntity> findByOrcid(String orcid, long lastModified);
    
    List<EmailEntity> findByOrcid(String orcid, String visibility);
    
    boolean updateVerifySetCurrentAndPrimary(String orcid, String email);
    
    /***
     * Indicates if the given email address could be auto deprecated given the
     * ORCID rules. See
     * https://trello.com/c/ouHyr0mp/3144-implement-new-auto-deprecate-workflow-
     * for-members-unclaimed-ids
     * 
     * @param email
     *            Email address
     * @return true if the email exists, the owner is not claimed and the
     *         client source of the record allows auto deprecating records
     */
    boolean isAutoDeprecateEnableForEmailUsingHash(String emailHash);
    
    boolean isPrimaryEmail(String email);
    
    boolean isPrimaryEmail(String orcid, String email);
    
    EmailEntity findPrimaryEmail(String orcid);
    
    boolean hideAllEmails(String orcid);

    List<EmailEntity> findPublicEmails(String orcid, long lastModified);
    
    boolean updateVisibility(String orcid, String email, String visibility);   
    
    List<String> getEmailsToHash(Integer batchSize); 
    
    boolean populateEmailHash(String email, String emailHash); 
    
    Integer clearEmailsAfterReactivation(String orcid);
}
