//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_bundles_hc_impl_code_cache_health_check_properties.g.dart';

/// ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
/// * [minimumPeriodCodePeriodCachePeriodSize] 
@BuiltValue()
abstract class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties implements Built<ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties, ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'minimum.code.cache.size')
  ConfigNodePropertyInteger? get minimumPeriodCodePeriodCachePeriodSize;

  ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties._();

  factory ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties([void updates(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties> get serializer => _$ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties, _$ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.minimumPeriodCodePeriodCachePeriodSize != null) {
      yield r'minimum.code.cache.size';
      yield serializers.serialize(
        object.minimumPeriodCodePeriodCachePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        case r'minimum.code.cache.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minimumPeriodCodePeriodCachePeriodSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder();
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

