//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_httpcache_file_file_cache_store_properties.g.dart';

/// ComAdobeGraniteHttpcacheFileFileCacheStoreProperties
///
/// Properties:
/// * [comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot] 
/// * [comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost] 
@BuiltValue()
abstract class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties implements Built<ComAdobeGraniteHttpcacheFileFileCacheStoreProperties, ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder> {
  @BuiltValueField(wireName: r'com.adobe.granite.httpcache.file.documentRoot')
  ConfigNodePropertyString? get comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot;

  @BuiltValueField(wireName: r'com.adobe.granite.httpcache.file.includeHost')
  ConfigNodePropertyString? get comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost;

  ComAdobeGraniteHttpcacheFileFileCacheStoreProperties._();

  factory ComAdobeGraniteHttpcacheFileFileCacheStoreProperties([void updates(ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder b)]) = _$ComAdobeGraniteHttpcacheFileFileCacheStoreProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteHttpcacheFileFileCacheStoreProperties> get serializer => _$ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesSerializer();
}

class _$ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteHttpcacheFileFileCacheStoreProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteHttpcacheFileFileCacheStoreProperties, _$ComAdobeGraniteHttpcacheFileFileCacheStoreProperties];

  @override
  final String wireName = r'ComAdobeGraniteHttpcacheFileFileCacheStoreProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteHttpcacheFileFileCacheStoreProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot != null) {
      yield r'com.adobe.granite.httpcache.file.documentRoot';
      yield serializers.serialize(
        object.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost != null) {
      yield r'com.adobe.granite.httpcache.file.includeHost';
      yield serializers.serialize(
        object.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteHttpcacheFileFileCacheStoreProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.adobe.granite.httpcache.file.documentRoot':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot.replace(valueDes);
          break;
        case r'com.adobe.granite.httpcache.file.includeHost':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteHttpcacheFileFileCacheStoreProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder();
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

