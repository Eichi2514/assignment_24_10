DROP DATABASE IF EXISTS Assignment_24_10;
CREATE DATABASE Assignment_24_10;
USE Assignment_24_10;

CREATE TABLE FAQ(
                    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '식별번호',
                    str TEXT NOT NULL COMMENT '질문',
                    answer TEXT NOT NULL COMMENT '답변'
);

INSERT INTO FAQ
SET
    str = '회원가입',
answer = '상단 메뉴의 회원가입 버튼을 클릭한 후 필요한 정보를 입력하면 가입할 수 있습니다.';

INSERT INTO FAQ
SET
    str = '비밀번호',
answer = '로그인 페이지에서 비밀번호 찾기를 클릭해 등록한 이메일로 비밀번호 재설정 링크를 받을 수 있습니다';

INSERT INTO FAQ
SET
    str = '게시글신고',
answer = '바둑이';

INSERT INTO FAQ
SET
    str = '게시글수정',
answer = '본인이 작성한 게시물의 경우, 게시물 하단의 수정 또는 삭제 버튼을 이용해 관리할 수 있습니다.';

INSERT INTO FAQ
SET
    str = '댓글신고',
answer = '각 댓글 옆에 있는 신고 버튼을 눌러 신고할 수 있으며, 운영진이 검토 후 적절한 조치를 취합니다.';

INSERT INTO FAQ
SET
    str = '규칙',
answer = '커뮤니티 이용 규칙을 준수해야 하며, 비방, 광고, 도배 등의 행위는 금지됩니다.';

INSERT INTO FAQ
SET
    str = '내정보',
answer = '내 정보 페이지에서 프로필 사진과 닉네임을 변경할 수 있습니다.';

INSERT INTO FAQ
SET
    str = '게시',
answer = '로그인 후 커뮤니티 페이지에서 글쓰기 버튼을 클릭해 작성 가능합니다. 제목과 내용을 입력 후 작성 완료를 누르면 게시됩니다.';

INSERT INTO FAQ
SET
    str = '댓글',
answer = '게시물 하단의 댓글 입력란에 내용을 작성하고 댓글 작성 버튼을 클릭하면 댓글이 추가됩니다.';

INSERT INTO FAQ
SET
    str = '탈퇴',
answer = '내 정보 페이지에서 회원 탈퇴 버튼을 눌러 진행할 수 있습니다. 탈퇴 시 작성한 게시물과 댓글이 삭제됩니다.';