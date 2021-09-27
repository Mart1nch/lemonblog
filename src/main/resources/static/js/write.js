var Editor;
// 初始化markdown
$(function() {
  Editor = editormd("editormd", {
    width: "100%",
    height: 640,
    syncScrolling: "single",
    path: "../plugins/editormd/lib/"
  });

  /*
  // or
  testEditor = editormd({
      id      : "test-editormd",
      width   : "90%",
      height  : 640,
      path    : "../lib/"
  });
  */
});
