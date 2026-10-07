//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties.g.dart';

/// ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties
///
/// Properties:
/// * [numberPeriodOfPeriodRetriesPeriodAllowed] 
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties implements Built<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties, ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'number.of.retries.allowed')
  ConfigNodePropertyInteger? get numberPeriodOfPeriodRetriesPeriodAllowed;

  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties._();

  factory ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties([void updates(ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties> get serializer => _$ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties, _$ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.numberPeriodOfPeriodRetriesPeriodAllowed != null) {
      yield r'number.of.retries.allowed';
      yield serializers.serialize(
        object.numberPeriodOfPeriodRetriesPeriodAllowed,
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
    ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'number.of.retries.allowed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.numberPeriodOfPeriodRetriesPeriodAllowed.replace(valueDes);
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
  ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder();
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

