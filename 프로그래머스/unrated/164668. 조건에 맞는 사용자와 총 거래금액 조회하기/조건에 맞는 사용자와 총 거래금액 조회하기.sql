-- 코드를 입력하세요
SELECT USED_GOODS_USER.USER_ID, USED_GOODS_USER.NICKNAME, SUM(USED_GOODS_BOARD.PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD LEFT JOIN USED_GOODS_USER 
ON USED_GOODS_BOARD.WRITER_ID = USED_GOODS_USER.USER_ID
WHERE USED_GOODS_BOARD.STATUS = 'DONE'
GROUP BY  USED_GOODS_BOARD.WRITER_ID
HAVING SUM(USED_GOODS_BOARD.PRICE) >= 700000
ORDER BY TOTAL_SALES