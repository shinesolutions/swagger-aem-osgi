//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_systemready_impl_components_check_properties.g.dart';

/// OrgApacheFelixSystemreadyImplComponentsCheckProperties
///
/// Properties:
/// * [componentsPeriodList] 
/// * [type] 
@BuiltValue()
abstract class OrgApacheFelixSystemreadyImplComponentsCheckProperties implements Built<OrgApacheFelixSystemreadyImplComponentsCheckProperties, OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'components.list')
  ConfigNodePropertyArray? get componentsPeriodList;

  @BuiltValueField(wireName: r'type')
  ConfigNodePropertyDropDown? get type;

  OrgApacheFelixSystemreadyImplComponentsCheckProperties._();

  factory OrgApacheFelixSystemreadyImplComponentsCheckProperties([void updates(OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder b)]) = _$OrgApacheFelixSystemreadyImplComponentsCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixSystemreadyImplComponentsCheckProperties> get serializer => _$OrgApacheFelixSystemreadyImplComponentsCheckPropertiesSerializer();
}

class _$OrgApacheFelixSystemreadyImplComponentsCheckPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixSystemreadyImplComponentsCheckProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixSystemreadyImplComponentsCheckProperties, _$OrgApacheFelixSystemreadyImplComponentsCheckProperties];

  @override
  final String wireName = r'OrgApacheFelixSystemreadyImplComponentsCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixSystemreadyImplComponentsCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.componentsPeriodList != null) {
      yield r'components.list';
      yield serializers.serialize(
        object.componentsPeriodList,
        specifiedType: const FullType(ConfigNodePropertyArray),
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
    OrgApacheFelixSystemreadyImplComponentsCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'components.list':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.componentsPeriodList.replace(valueDes);
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
  OrgApacheFelixSystemreadyImplComponentsCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder();
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

