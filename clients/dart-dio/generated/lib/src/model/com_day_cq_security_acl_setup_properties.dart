//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_security_acl_setup_properties.g.dart';

/// ComDayCqSecurityACLSetupProperties
///
/// Properties:
/// * [cqPeriodAclsetupPeriodRules] 
@BuiltValue()
abstract class ComDayCqSecurityACLSetupProperties implements Built<ComDayCqSecurityACLSetupProperties, ComDayCqSecurityACLSetupPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.aclsetup.rules')
  ConfigNodePropertyArray? get cqPeriodAclsetupPeriodRules;

  ComDayCqSecurityACLSetupProperties._();

  factory ComDayCqSecurityACLSetupProperties([void updates(ComDayCqSecurityACLSetupPropertiesBuilder b)]) = _$ComDayCqSecurityACLSetupProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqSecurityACLSetupPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqSecurityACLSetupProperties> get serializer => _$ComDayCqSecurityACLSetupPropertiesSerializer();
}

class _$ComDayCqSecurityACLSetupPropertiesSerializer implements PrimitiveSerializer<ComDayCqSecurityACLSetupProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqSecurityACLSetupProperties, _$ComDayCqSecurityACLSetupProperties];

  @override
  final String wireName = r'ComDayCqSecurityACLSetupProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqSecurityACLSetupProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAclsetupPeriodRules != null) {
      yield r'cq.aclsetup.rules';
      yield serializers.serialize(
        object.cqPeriodAclsetupPeriodRules,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqSecurityACLSetupProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqSecurityACLSetupPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.aclsetup.rules':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodAclsetupPeriodRules.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqSecurityACLSetupProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqSecurityACLSetupPropertiesBuilder();
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

