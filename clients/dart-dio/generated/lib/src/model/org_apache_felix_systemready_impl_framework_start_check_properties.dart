//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_systemready_impl_framework_start_check_properties.g.dart';

/// OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties
///
/// Properties:
/// * [timeout] 
/// * [targetPeriodStartPeriodLevel] 
/// * [targetPeriodStartPeriodLevelPeriodPropPeriodName] 
/// * [type] 
@BuiltValue()
abstract class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties implements Built<OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties, OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'timeout')
  ConfigNodePropertyInteger? get timeout;

  @BuiltValueField(wireName: r'target.start.level')
  ConfigNodePropertyInteger? get targetPeriodStartPeriodLevel;

  @BuiltValueField(wireName: r'target.start.level.prop.name')
  ConfigNodePropertyString? get targetPeriodStartPeriodLevelPeriodPropPeriodName;

  @BuiltValueField(wireName: r'type')
  ConfigNodePropertyDropDown? get type;

  OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties._();

  factory OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties([void updates(OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder b)]) = _$OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties> get serializer => _$OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesSerializer();
}

class _$OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties, _$OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties];

  @override
  final String wireName = r'OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.timeout != null) {
      yield r'timeout';
      yield serializers.serialize(
        object.timeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.targetPeriodStartPeriodLevel != null) {
      yield r'target.start.level';
      yield serializers.serialize(
        object.targetPeriodStartPeriodLevel,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.targetPeriodStartPeriodLevelPeriodPropPeriodName != null) {
      yield r'target.start.level.prop.name';
      yield serializers.serialize(
        object.targetPeriodStartPeriodLevelPeriodPropPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.timeout.replace(valueDes);
          break;
        case r'target.start.level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.targetPeriodStartPeriodLevel.replace(valueDes);
          break;
        case r'target.start.level.prop.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.targetPeriodStartPeriodLevelPeriodPropPeriodName.replace(valueDes);
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.type.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder();
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

