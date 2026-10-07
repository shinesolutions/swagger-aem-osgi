//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_systemready_impl_services_check_properties.g.dart';

/// OrgApacheFelixSystemreadyImplServicesCheckProperties
///
/// Properties:
/// * [servicesPeriodList] 
/// * [type] 
@BuiltValue()
abstract class OrgApacheFelixSystemreadyImplServicesCheckProperties implements Built<OrgApacheFelixSystemreadyImplServicesCheckProperties, OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'services.list')
  ConfigNodePropertyArray? get servicesPeriodList;

  @BuiltValueField(wireName: r'type')
  ConfigNodePropertyDropDown? get type;

  OrgApacheFelixSystemreadyImplServicesCheckProperties._();

  factory OrgApacheFelixSystemreadyImplServicesCheckProperties([void updates(OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder b)]) = _$OrgApacheFelixSystemreadyImplServicesCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixSystemreadyImplServicesCheckProperties> get serializer => _$OrgApacheFelixSystemreadyImplServicesCheckPropertiesSerializer();
}

class _$OrgApacheFelixSystemreadyImplServicesCheckPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixSystemreadyImplServicesCheckProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixSystemreadyImplServicesCheckProperties, _$OrgApacheFelixSystemreadyImplServicesCheckProperties];

  @override
  final String wireName = r'OrgApacheFelixSystemreadyImplServicesCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixSystemreadyImplServicesCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicesPeriodList != null) {
      yield r'services.list';
      yield serializers.serialize(
        object.servicesPeriodList,
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
    OrgApacheFelixSystemreadyImplServicesCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'services.list':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.servicesPeriodList.replace(valueDes);
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
  OrgApacheFelixSystemreadyImplServicesCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder();
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

