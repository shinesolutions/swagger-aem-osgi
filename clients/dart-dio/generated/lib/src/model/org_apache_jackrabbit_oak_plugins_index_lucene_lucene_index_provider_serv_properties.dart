//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties
///
/// Properties:
/// * [disabled] 
/// * [debug] 
/// * [localIndexDir] 
/// * [enableOpenIndexAsync] 
/// * [threadPoolSize] 
/// * [prefetchIndexFiles] 
/// * [extractedTextCacheSizeInMB] 
/// * [extractedTextCacheExpiryInSecs] 
/// * [alwaysUsePreExtractedCache] 
/// * [booleanClauseLimit] 
/// * [enableHybridIndexing] 
/// * [hybridQueueSize] 
/// * [disableStoredIndexDefinition] 
/// * [deletedBlobsCollectionEnabled] 
/// * [propIndexCleanerIntervalInSecs] 
/// * [enableSingleBlobIndexFiles] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties implements Built<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties, OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder> {
  @BuiltValueField(wireName: r'disabled')
  ConfigNodePropertyBoolean? get disabled;

  @BuiltValueField(wireName: r'debug')
  ConfigNodePropertyBoolean? get debug;

  @BuiltValueField(wireName: r'localIndexDir')
  ConfigNodePropertyString? get localIndexDir;

  @BuiltValueField(wireName: r'enableOpenIndexAsync')
  ConfigNodePropertyBoolean? get enableOpenIndexAsync;

  @BuiltValueField(wireName: r'threadPoolSize')
  ConfigNodePropertyInteger? get threadPoolSize;

  @BuiltValueField(wireName: r'prefetchIndexFiles')
  ConfigNodePropertyBoolean? get prefetchIndexFiles;

  @BuiltValueField(wireName: r'extractedTextCacheSizeInMB')
  ConfigNodePropertyInteger? get extractedTextCacheSizeInMB;

  @BuiltValueField(wireName: r'extractedTextCacheExpiryInSecs')
  ConfigNodePropertyInteger? get extractedTextCacheExpiryInSecs;

  @BuiltValueField(wireName: r'alwaysUsePreExtractedCache')
  ConfigNodePropertyBoolean? get alwaysUsePreExtractedCache;

  @BuiltValueField(wireName: r'booleanClauseLimit')
  ConfigNodePropertyInteger? get booleanClauseLimit;

  @BuiltValueField(wireName: r'enableHybridIndexing')
  ConfigNodePropertyBoolean? get enableHybridIndexing;

  @BuiltValueField(wireName: r'hybridQueueSize')
  ConfigNodePropertyInteger? get hybridQueueSize;

  @BuiltValueField(wireName: r'disableStoredIndexDefinition')
  ConfigNodePropertyBoolean? get disableStoredIndexDefinition;

  @BuiltValueField(wireName: r'deletedBlobsCollectionEnabled')
  ConfigNodePropertyBoolean? get deletedBlobsCollectionEnabled;

  @BuiltValueField(wireName: r'propIndexCleanerIntervalInSecs')
  ConfigNodePropertyInteger? get propIndexCleanerIntervalInSecs;

  @BuiltValueField(wireName: r'enableSingleBlobIndexFiles')
  ConfigNodePropertyBoolean? get enableSingleBlobIndexFiles;

  OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties._();

  factory OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties([void updates(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties> get serializer => _$OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties, _$OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.disabled != null) {
      yield r'disabled';
      yield serializers.serialize(
        object.disabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.debug != null) {
      yield r'debug';
      yield serializers.serialize(
        object.debug,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.localIndexDir != null) {
      yield r'localIndexDir';
      yield serializers.serialize(
        object.localIndexDir,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.enableOpenIndexAsync != null) {
      yield r'enableOpenIndexAsync';
      yield serializers.serialize(
        object.enableOpenIndexAsync,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.threadPoolSize != null) {
      yield r'threadPoolSize';
      yield serializers.serialize(
        object.threadPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.prefetchIndexFiles != null) {
      yield r'prefetchIndexFiles';
      yield serializers.serialize(
        object.prefetchIndexFiles,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.extractedTextCacheSizeInMB != null) {
      yield r'extractedTextCacheSizeInMB';
      yield serializers.serialize(
        object.extractedTextCacheSizeInMB,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.extractedTextCacheExpiryInSecs != null) {
      yield r'extractedTextCacheExpiryInSecs';
      yield serializers.serialize(
        object.extractedTextCacheExpiryInSecs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.alwaysUsePreExtractedCache != null) {
      yield r'alwaysUsePreExtractedCache';
      yield serializers.serialize(
        object.alwaysUsePreExtractedCache,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.booleanClauseLimit != null) {
      yield r'booleanClauseLimit';
      yield serializers.serialize(
        object.booleanClauseLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.enableHybridIndexing != null) {
      yield r'enableHybridIndexing';
      yield serializers.serialize(
        object.enableHybridIndexing,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.hybridQueueSize != null) {
      yield r'hybridQueueSize';
      yield serializers.serialize(
        object.hybridQueueSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.disableStoredIndexDefinition != null) {
      yield r'disableStoredIndexDefinition';
      yield serializers.serialize(
        object.disableStoredIndexDefinition,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.deletedBlobsCollectionEnabled != null) {
      yield r'deletedBlobsCollectionEnabled';
      yield serializers.serialize(
        object.deletedBlobsCollectionEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.propIndexCleanerIntervalInSecs != null) {
      yield r'propIndexCleanerIntervalInSecs';
      yield serializers.serialize(
        object.propIndexCleanerIntervalInSecs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.enableSingleBlobIndexFiles != null) {
      yield r'enableSingleBlobIndexFiles';
      yield serializers.serialize(
        object.enableSingleBlobIndexFiles,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'disabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.disabled.replace(valueDes);
          break;
        case r'debug':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.debug.replace(valueDes);
          break;
        case r'localIndexDir':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.localIndexDir.replace(valueDes);
          break;
        case r'enableOpenIndexAsync':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableOpenIndexAsync.replace(valueDes);
          break;
        case r'threadPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.threadPoolSize.replace(valueDes);
          break;
        case r'prefetchIndexFiles':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.prefetchIndexFiles.replace(valueDes);
          break;
        case r'extractedTextCacheSizeInMB':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.extractedTextCacheSizeInMB.replace(valueDes);
          break;
        case r'extractedTextCacheExpiryInSecs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.extractedTextCacheExpiryInSecs.replace(valueDes);
          break;
        case r'alwaysUsePreExtractedCache':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.alwaysUsePreExtractedCache.replace(valueDes);
          break;
        case r'booleanClauseLimit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.booleanClauseLimit.replace(valueDes);
          break;
        case r'enableHybridIndexing':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableHybridIndexing.replace(valueDes);
          break;
        case r'hybridQueueSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.hybridQueueSize.replace(valueDes);
          break;
        case r'disableStoredIndexDefinition':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.disableStoredIndexDefinition.replace(valueDes);
          break;
        case r'deletedBlobsCollectionEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.deletedBlobsCollectionEnabled.replace(valueDes);
          break;
        case r'propIndexCleanerIntervalInSecs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.propIndexCleanerIntervalInSecs.replace(valueDes);
          break;
        case r'enableSingleBlobIndexFiles':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableSingleBlobIndexFiles.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

