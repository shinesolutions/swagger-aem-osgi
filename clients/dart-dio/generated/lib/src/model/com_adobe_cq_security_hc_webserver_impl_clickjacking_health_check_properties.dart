//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check_properties.g.dart';

/// ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
/// * [webserverPeriodAddress] 
@BuiltValue()
abstract class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties implements Built<ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties, ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'webserver.address')
  ConfigNodePropertyString? get webserverPeriodAddress;

  ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties._();

  factory ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties([void updates(ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder b)]) = _$ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties> get serializer => _$ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesSerializer();
}

class _$ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties, _$ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.webserverPeriodAddress != null) {
      yield r'webserver.address';
      yield serializers.serialize(
        object.webserverPeriodAddress,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder result,
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
        case r'webserver.address':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.webserverPeriodAddress.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder();
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

