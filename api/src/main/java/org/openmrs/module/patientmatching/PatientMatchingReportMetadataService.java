package org.openmrs.module.patientmatching;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PatientMatchingReportMetadataService {

	public void saveReportDetails(PatientMatchingReportMetadata pri);

	public void savePatientMatchingConfiguration(PatientMatchingConfiguration patientMatchingConfiguration);

	public void deletePatientMatchingConfigurationByName(String name);

	@Transactional(readOnly=true)
	public PatientMatchingConfiguration findPatientMatchingConfigurationByName(String name);

	@Transactional(readOnly=true)
	public List<PatientMatchingConfiguration> getBlockingRuns();

	@Transactional(readOnly=true)
	public List<PatientMatchingConfiguration> getMatchingConfigs();

	@Transactional(readOnly=true)
	public PatientMatchingConfiguration getPatientMatchingConfiguration(Long configurationId);

	public void deletePatientMatchingConfiguration(PatientMatchingConfiguration configuration);
}
