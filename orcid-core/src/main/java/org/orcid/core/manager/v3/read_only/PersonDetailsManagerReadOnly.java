package org.orcid.core.manager.v3.read_only;

import org.orcid.jaxb.model.v3.release.record.Person;

public interface PersonDetailsManagerReadOnly {
    
    Person getPersonDetails(String orcid, boolean includeUnverifiedEmails);
    
    Person getPublicPersonDetails(String orcid);
}
