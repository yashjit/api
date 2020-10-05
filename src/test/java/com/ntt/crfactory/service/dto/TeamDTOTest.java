package com.ntt.crfactory.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.ntt.crfactory.web.rest.TestUtil;

public class TeamDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(TeamDTO.class);
        TeamDTO teamDTO1 = new TeamDTO();
        teamDTO1.setId("id1");
        TeamDTO teamDTO2 = new TeamDTO();
        assertThat(teamDTO1).isNotEqualTo(teamDTO2);
        teamDTO2.setId(teamDTO1.getId());
        assertThat(teamDTO1).isEqualTo(teamDTO2);
        teamDTO2.setId("id2");
        assertThat(teamDTO1).isNotEqualTo(teamDTO2);
        teamDTO1.setId(null);
        assertThat(teamDTO1).isNotEqualTo(teamDTO2);
    }
}
