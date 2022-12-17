package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class MenuByCategoryDataTest {

    @DisplayName("같은 이름의 Menu를 넘겨주었을때 참을 반환하는지 테스트")
    @Test
    void hasMenu() throws IOException {
        //given
        MenuByCategoryData menuData = new MenuByCategoryData();
        //when
        boolean result = menuData.hasMenu("규동");
        //then
        Assertions.assertThat(result)
                  .isTrue();
    }
}