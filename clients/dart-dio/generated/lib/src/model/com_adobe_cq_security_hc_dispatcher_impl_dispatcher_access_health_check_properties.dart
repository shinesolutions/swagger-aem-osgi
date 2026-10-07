//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties.g.dart';

/// ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
/// * [dispatcherPeriodAddress] 
/// * [dispatcherPeriodFilterPeriodAllowed] 
/// * [dispatcherPeriodFilterPeriodBlocked] 
@BuiltValue()
abstract class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties implements Built<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties, ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'dispatcher.address')
  ConfigNodePropertyString? get dispatcherPeriodAddress;

  @BuiltValueField(wireName: r'dispatcher.filter.allowed')
  ConfigNodePropertyArray? get dispatcherPeriodFilterPeriodAllowed;

  @BuiltValueField(wireName: r'dispatcher.filter.blocked')
  ConfigNodePropertyArray? get dispatcherPeriodFilterPeriodBlocked;

  ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties._();

  factory ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties([void updates(ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder b)]) = _$ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties> get serializer => _$ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesSerializer();
}

class _$ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties, _$ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.dispatcherPeriodAddress != null) {
      yield r'dispatcher.address';
      yield serializers.serialize(
        object.dispatcherPeriodAddress,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.dispatcherPeriodFilterPeriodAllowed != null) {
      yield r'dispatcher.filter.allowed';
      yield serializers.serialize(
        object.dispatcherPeriodFilterPeriodAllowed,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.dispatcherPeriodFilterPeriodBlocked != null) {
      yield r'dispatcher.filter.blocked';
      yield serializers.serialize(
        object.dispatcherPeriodFilterPeriodBlocked,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder result,
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
        case r'dispatcher.address':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.dispatcherPeriodAddress.replace(valueDes);
          break;
        case r'dispatcher.filter.allowed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.dispatcherPeriodFilterPeriodAllowed.replace(valueDes);
          break;
        case r'dispatcher.filter.blocked':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.dispatcherPeriodFilterPeriodBlocked.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder();
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

