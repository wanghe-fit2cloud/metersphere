package io.metersphere.dto;

import io.metersphere.base.domain.TestCaseWithBLOBs;
import lombok.Data;

@Data
public class TestPlanCaseDTO extends TestCaseWithBLOBs {

    private String executor;
    private String executorName;
    private String status;
    private String results;
}
