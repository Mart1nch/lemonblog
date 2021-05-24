var Editor;
// 初始化markdown
$(function() {
  Editor = editormd("editormd", {
    width: "100%",
    height: 640,
    syncScrolling: "single",
    path: "editormd/lib/",
    // 启动本地图片自动上传功能
    imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
    imageUploadURL: "/xxx",
    
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
