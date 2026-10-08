//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_queries_impl_hc_large_index_health_check_properties.g.dart';

/// ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties
///
/// Properties:
/// * [largePeriodIndexPeriodCriticalPeriodThreshold] 
/// * [largePeriodIndexPeriodWarnPeriodThreshold] 
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties implements Built<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties, ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'large.index.critical.threshold')
  ConfigNodePropertyInteger? get largePeriodIndexPeriodCriticalPeriodThreshold;

  @BuiltValueField(wireName: r'large.index.warn.threshold')
  ConfigNodePropertyInteger? get largePeriodIndexPeriodWarnPeriodThreshold;

  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties._();

  factory ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties([void updates(ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties> get serializer => _$ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties, _$ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.largePeriodIndexPeriodCriticalPeriodThreshold != null) {
      yield r'large.index.critical.threshold';
      yield serializers.serialize(
        object.largePeriodIndexPeriodCriticalPeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.largePeriodIndexPeriodWarnPeriodThreshold != null) {
      yield r'large.index.warn.threshold';
      yield serializers.serialize(
        object.largePeriodIndexPeriodWarnPeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'large.index.critical.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.largePeriodIndexPeriodCriticalPeriodThreshold.replace(valueDes);
          break;
        case r'large.index.warn.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.largePeriodIndexPeriodWarnPeriodThreshold.replace(valueDes);
          break;
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder();
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

