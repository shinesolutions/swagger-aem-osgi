//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties.g.dart';

/// OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties
///
/// Properties:
/// * [name] 
/// * [username] 
/// * [password] 
@BuiltValue()
abstract class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties implements Built<OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties, OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'username')
  ConfigNodePropertyString? get username;

  @BuiltValueField(wireName: r'password')
  ConfigNodePropertyString? get password;

  OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties._();

  factory OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties([void updates(OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder b)]) = _$OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties> get serializer => _$OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesSerializer();
}

class _$OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties, _$OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.username != null) {
      yield r'username';
      yield serializers.serialize(
        object.username,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.password != null) {
      yield r'password';
      yield serializers.serialize(
        object.password,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.name.replace(valueDes);
          break;
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.username.replace(valueDes);
          break;
        case r'password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.password.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder();
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

