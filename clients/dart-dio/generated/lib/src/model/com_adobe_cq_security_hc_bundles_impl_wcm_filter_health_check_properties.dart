//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_properties.g.dart';

/// ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties implements Built<ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties, ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties._();

  factory ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties([void updates(ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder b)]) = _$ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties> get serializer => _$ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesSerializer();
}

class _$ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties, _$ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder();
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

