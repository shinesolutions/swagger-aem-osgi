//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_httpcache_impl_outer_cache_filter_properties.g.dart';

/// ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties
///
/// Properties:
/// * [comPeriodAdobePeriodGranitePeriodHttpcachePeriodUrlPeriodPaths] 
@BuiltValue()
abstract class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties implements Built<ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties, ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'com.adobe.granite.httpcache.url.paths')
  ConfigNodePropertyArray? get comPeriodAdobePeriodGranitePeriodHttpcachePeriodUrlPeriodPaths;

  ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties._();

  factory ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties([void updates(ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder b)]) = _$ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties> get serializer => _$ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesSerializer();
}

class _$ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties, _$ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties];

  @override
  final String wireName = r'ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodAdobePeriodGranitePeriodHttpcachePeriodUrlPeriodPaths != null) {
      yield r'com.adobe.granite.httpcache.url.paths';
      yield serializers.serialize(
        object.comPeriodAdobePeriodGranitePeriodHttpcachePeriodUrlPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.adobe.granite.httpcache.url.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodGranitePeriodHttpcachePeriodUrlPeriodPaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder();
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

