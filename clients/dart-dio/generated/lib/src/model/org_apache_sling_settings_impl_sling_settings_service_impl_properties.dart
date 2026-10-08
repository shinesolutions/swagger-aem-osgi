//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_settings_impl_sling_settings_service_impl_properties.g.dart';

/// OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties
///
/// Properties:
/// * [slingPeriodName] 
/// * [slingPeriodDescription] 
@BuiltValue()
abstract class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties implements Built<OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties, OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.name')
  ConfigNodePropertyString? get slingPeriodName;

  @BuiltValueField(wireName: r'sling.description')
  ConfigNodePropertyString? get slingPeriodDescription;

  OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties._();

  factory OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties([void updates(OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder b)]) = _$OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties> get serializer => _$OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesSerializer();
}

class _$OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties, _$OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties];

  @override
  final String wireName = r'OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodName != null) {
      yield r'sling.name';
      yield serializers.serialize(
        object.slingPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodDescription != null) {
      yield r'sling.description';
      yield serializers.serialize(
        object.slingPeriodDescription,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodName.replace(valueDes);
          break;
        case r'sling.description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodDescription.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder();
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

