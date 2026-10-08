//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_aries_jmx_framework_state_config_properties.g.dart';

/// OrgApacheAriesJmxFrameworkStateConfigProperties
///
/// Properties:
/// * [attributeChangeNotificationEnabled] 
@BuiltValue()
abstract class OrgApacheAriesJmxFrameworkStateConfigProperties implements Built<OrgApacheAriesJmxFrameworkStateConfigProperties, OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'attributeChangeNotificationEnabled')
  ConfigNodePropertyBoolean? get attributeChangeNotificationEnabled;

  OrgApacheAriesJmxFrameworkStateConfigProperties._();

  factory OrgApacheAriesJmxFrameworkStateConfigProperties([void updates(OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder b)]) = _$OrgApacheAriesJmxFrameworkStateConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheAriesJmxFrameworkStateConfigProperties> get serializer => _$OrgApacheAriesJmxFrameworkStateConfigPropertiesSerializer();
}

class _$OrgApacheAriesJmxFrameworkStateConfigPropertiesSerializer implements PrimitiveSerializer<OrgApacheAriesJmxFrameworkStateConfigProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheAriesJmxFrameworkStateConfigProperties, _$OrgApacheAriesJmxFrameworkStateConfigProperties];

  @override
  final String wireName = r'OrgApacheAriesJmxFrameworkStateConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheAriesJmxFrameworkStateConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.attributeChangeNotificationEnabled != null) {
      yield r'attributeChangeNotificationEnabled';
      yield serializers.serialize(
        object.attributeChangeNotificationEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheAriesJmxFrameworkStateConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributeChangeNotificationEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.attributeChangeNotificationEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheAriesJmxFrameworkStateConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheAriesJmxFrameworkStateConfigPropertiesBuilder();
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

