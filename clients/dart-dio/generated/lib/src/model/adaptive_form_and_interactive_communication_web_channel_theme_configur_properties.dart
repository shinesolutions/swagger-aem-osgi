//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'adaptive_form_and_interactive_communication_web_channel_theme_configur_properties.g.dart';

/// AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
///
/// Properties:
/// * [fontList] 
@BuiltValue()
abstract class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties implements Built<AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties, AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder> {
  @BuiltValueField(wireName: r'fontList')
  ConfigNodePropertyArray? get fontList;

  AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties._();

  factory AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties([void updates(AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder b)]) = _$AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties> get serializer => _$AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesSerializer();
}

class _$AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesSerializer implements PrimitiveSerializer<AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties> {
  @override
  final Iterable<Type> types = const [AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties, _$AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties];

  @override
  final String wireName = r'AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fontList != null) {
      yield r'fontList';
      yield serializers.serialize(
        object.fontList,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'fontList':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.fontList.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder();
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

