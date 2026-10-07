//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'adaptive_form_and_interactive_communication_web_channel_configuration_properties.g.dart';

/// AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties
///
/// Properties:
/// * [showPlaceholder] 
/// * [maximumCacheEntries] 
/// * [afPeriodScriptingPeriodCompatversion] 
/// * [makeFileNameUnique] 
/// * [generatingCompliantData] 
@BuiltValue()
abstract class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties implements Built<AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties, AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder> {
  @BuiltValueField(wireName: r'showPlaceholder')
  ConfigNodePropertyBoolean? get showPlaceholder;

  @BuiltValueField(wireName: r'maximumCacheEntries')
  ConfigNodePropertyInteger? get maximumCacheEntries;

  @BuiltValueField(wireName: r'af.scripting.compatversion')
  ConfigNodePropertyDropDown? get afPeriodScriptingPeriodCompatversion;

  @BuiltValueField(wireName: r'makeFileNameUnique')
  ConfigNodePropertyBoolean? get makeFileNameUnique;

  @BuiltValueField(wireName: r'generatingCompliantData')
  ConfigNodePropertyBoolean? get generatingCompliantData;

  AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties._();

  factory AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties([void updates(AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder b)]) = _$AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties> get serializer => _$AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesSerializer();
}

class _$AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesSerializer implements PrimitiveSerializer<AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties> {
  @override
  final Iterable<Type> types = const [AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties, _$AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties];

  @override
  final String wireName = r'AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.showPlaceholder != null) {
      yield r'showPlaceholder';
      yield serializers.serialize(
        object.showPlaceholder,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.maximumCacheEntries != null) {
      yield r'maximumCacheEntries';
      yield serializers.serialize(
        object.maximumCacheEntries,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.afPeriodScriptingPeriodCompatversion != null) {
      yield r'af.scripting.compatversion';
      yield serializers.serialize(
        object.afPeriodScriptingPeriodCompatversion,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.makeFileNameUnique != null) {
      yield r'makeFileNameUnique';
      yield serializers.serialize(
        object.makeFileNameUnique,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.generatingCompliantData != null) {
      yield r'generatingCompliantData';
      yield serializers.serialize(
        object.generatingCompliantData,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'showPlaceholder':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.showPlaceholder.replace(valueDes);
          break;
        case r'maximumCacheEntries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maximumCacheEntries.replace(valueDes);
          break;
        case r'af.scripting.compatversion':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.afPeriodScriptingPeriodCompatversion.replace(valueDes);
          break;
        case r'makeFileNameUnique':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.makeFileNameUnique.replace(valueDes);
          break;
        case r'generatingCompliantData':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.generatingCompliantData.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder();
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

