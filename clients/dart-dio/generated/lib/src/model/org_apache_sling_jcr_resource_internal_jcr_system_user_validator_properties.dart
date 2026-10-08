//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties.g.dart';

/// OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties
///
/// Properties:
/// * [allowPeriodOnlyPeriodSystemPeriodUser] 
@BuiltValue()
abstract class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties implements Built<OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties, OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder> {
  @BuiltValueField(wireName: r'allow.only.system.user')
  ConfigNodePropertyBoolean? get allowPeriodOnlyPeriodSystemPeriodUser;

  OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties._();

  factory OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties([void updates(OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder b)]) = _$OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties> get serializer => _$OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesSerializer();
}

class _$OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties, _$OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.allowPeriodOnlyPeriodSystemPeriodUser != null) {
      yield r'allow.only.system.user';
      yield serializers.serialize(
        object.allowPeriodOnlyPeriodSystemPeriodUser,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'allow.only.system.user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.allowPeriodOnlyPeriodSystemPeriodUser.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder();
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

