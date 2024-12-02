# Activity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actUser** | [**User**](User.md) |  |  [optional]
**actUserId** | **Long** |  |  [optional]
**comment** | [**Comment**](Comment.md) |  |  [optional]
**commentId** | **Long** |  |  [optional]
**content** | **String** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**isPrivate** | **Boolean** |  |  [optional]
**opType** | [**OpTypeEnum**](#OpTypeEnum) | the type of action |  [optional]
**refName** | **String** |  |  [optional]
**repo** | [**Repository**](Repository.md) |  |  [optional]
**repoId** | **Long** |  |  [optional]
**userId** | **Long** |  |  [optional]

<a name="OpTypeEnum"></a>
## Enum: OpTypeEnum
Name | Value
---- | -----
CREATE_REPO | &quot;create_repo&quot;
RENAME_REPO | &quot;rename_repo&quot;
STAR_REPO | &quot;star_repo&quot;
WATCH_REPO | &quot;watch_repo&quot;
COMMIT_REPO | &quot;commit_repo&quot;
CREATE_ISSUE | &quot;create_issue&quot;
CREATE_PULL_REQUEST | &quot;create_pull_request&quot;
TRANSFER_REPO | &quot;transfer_repo&quot;
PUSH_TAG | &quot;push_tag&quot;
COMMENT_ISSUE | &quot;comment_issue&quot;
MERGE_PULL_REQUEST | &quot;merge_pull_request&quot;
CLOSE_ISSUE | &quot;close_issue&quot;
REOPEN_ISSUE | &quot;reopen_issue&quot;
CLOSE_PULL_REQUEST | &quot;close_pull_request&quot;
REOPEN_PULL_REQUEST | &quot;reopen_pull_request&quot;
DELETE_TAG | &quot;delete_tag&quot;
DELETE_BRANCH | &quot;delete_branch&quot;
MIRROR_SYNC_PUSH | &quot;mirror_sync_push&quot;
MIRROR_SYNC_CREATE | &quot;mirror_sync_create&quot;
MIRROR_SYNC_DELETE | &quot;mirror_sync_delete&quot;
APPROVE_PULL_REQUEST | &quot;approve_pull_request&quot;
REJECT_PULL_REQUEST | &quot;reject_pull_request&quot;
COMMENT_PULL | &quot;comment_pull&quot;
PUBLISH_RELEASE | &quot;publish_release&quot;
PULL_REVIEW_DISMISSED | &quot;pull_review_dismissed&quot;
PULL_REQUEST_READY_FOR_REVIEW | &quot;pull_request_ready_for_review&quot;
AUTO_MERGE_PULL_REQUEST | &quot;auto_merge_pull_request&quot;
