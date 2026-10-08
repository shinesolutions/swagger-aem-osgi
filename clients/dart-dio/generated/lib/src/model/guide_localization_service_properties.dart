//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'guide_localization_service_properties.g.dart';

/// GuideLocalizationServiceProperties
///
/// Properties:
/// * [supportedLocales] 
/// * [localizableProperties] 
@BuiltValue()
abstract class GuideLocalizationServiceProperties implements Built<GuideLocalizationServiceProperties, GuideLocalizationServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'supportedLocales')
  ConfigNodePropertyArray? get supportedLocales;

  @BuiltValueField(wireName: r'Localizable Properties')
  ConfigNodePropertyArray? get localizableProperties;

  GuideLocalizationServiceProperties._();

  factory GuideLocalizationServiceProperties([void updates(GuideLocalizationServicePropertiesBuilder b)]) = _$GuideLocalizationServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GuideLocalizationServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GuideLocalizationServiceProperties> get serializer => _$GuideLocalizationServicePropertiesSerializer();
}

class _$GuideLocalizationServicePropertiesSerializer implements PrimitiveSerializer<GuideLocalizationServiceProperties> {
  @override
  final Iterable<Type> types = const [GuideLocalizationServiceProperties, _$GuideLocalizationServiceProperties];

  @override
  final String wireName = r'GuideLocalizationServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GuideLocalizationServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.supportedLocales != null) {
      yield r'supportedLocales';
      yield serializers.serialize(
        object.supportedLocales,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.localizableProperties != null) {
      yield r'Localizable Properties';
      yield serializers.serialize(
        object.localizableProperties,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    GuideLocalizationServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GuideLocalizationServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'supportedLocales':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.supportedLocales.replace(valueDes);
          break;
        case r'Localizable Properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.localizableProperties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GuideLocalizationServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GuideLocalizationServicePropertiesBuilder();
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

