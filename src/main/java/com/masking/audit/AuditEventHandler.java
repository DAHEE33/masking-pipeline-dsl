package com.masking.audit;

import java.io.IOException;

public interface AuditEventHandler {
    /**
     * 필드별 적용 전후 값을 전달받아 처리
     * @param field   대상 필드 이름
     * @param before  액션 적용 전 값
     * @param after   액션 적용 후 값
     * @throws IOException 처리 중 I/O 오류가 발생한 경우
     */
    void handle(String field, String before, String after) throws IOException;
}
