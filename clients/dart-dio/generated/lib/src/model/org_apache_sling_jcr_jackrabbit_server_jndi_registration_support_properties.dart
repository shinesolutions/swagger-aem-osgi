//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties.g.dart';

/// OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties
///
/// Properties:
/// * [javaPeriodNamingPeriodFactoryPeriodInitial] 
/// * [javaPeriodNamingPeriodProviderPeriodUrl] 
@BuiltValue()
abstract class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties implements Built<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties, OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder> {
  @BuiltValueField(wireName: r'java.naming.factory.initial')
  ConfigNodePropertyString? get javaPeriodNamingPeriodFactoryPeriodInitial;

  @BuiltValueField(wireName: r'java.naming.provider.url')
  ConfigNodePropertyString? get javaPeriodNamingPeriodProviderPeriodUrl;

  OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties._();

  factory OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties([void updates(OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder b)]) = _$OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties> get serializer => _$OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesSerializer();
}

class _$OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties, _$OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.javaPeriodNamingPeriodFactoryPeriodInitial != null) {
      yield r'java.naming.factory.initial';
      yield serializers.serialize(
        object.javaPeriodNamingPeriodFactoryPeriodInitial,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.javaPeriodNamingPeriodProviderPeriodUrl != null) {
      yield r'java.naming.provider.url';
      yield serializers.serialize(
        object.javaPeriodNamingPeriodProviderPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'java.naming.factory.initial':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.javaPeriodNamingPeriodFactoryPeriodInitial.replace(valueDes);
          break;
        case r'java.naming.provider.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.javaPeriodNamingPeriodProviderPeriodUrl.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder();
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

