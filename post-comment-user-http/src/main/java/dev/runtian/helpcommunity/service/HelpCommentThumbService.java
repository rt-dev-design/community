package dev.runtian.helpcommunity.service;

import dev.runtian.helpcommunity.model.entity.HelpCommentThumb;
import com.baomidou.mybatisplus.extension.service.IService;
import dev.runtian.helpcommunity.model.entity.User;

/**
* @author rt
* @description 针对表【help_comment_thumb(评论点赞)】的数据库操作Service
* @createDate 2024-02-23 19:34:17
*/
public interface HelpCommentThumbService extends IService<HelpCommentThumb> {
    int doHelpCommentThumb(long helpCommentId, User loginUser);

    int doHelpCommentThumbInner(long userId, long helpCommentId);
}
