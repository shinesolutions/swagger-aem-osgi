//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties.g.dart';

/// ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties
///
/// Properties:
/// * [omnisearchPeriodSuggestionPeriodRequiretextPeriodMin] 
/// * [omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire] 
@BuiltValue()
abstract class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties implements Built<ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties, ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'omnisearch.suggestion.requiretext.min')
  ConfigNodePropertyInteger? get omnisearchPeriodSuggestionPeriodRequiretextPeriodMin;

  @BuiltValueField(wireName: r'omnisearch.suggestion.spellcheck.require')
  ConfigNodePropertyBoolean? get omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire;

  ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties._();

  factory ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties([void updates(ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder b)]) = _$ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties> get serializer => _$ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesSerializer();
}

class _$ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties, _$ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.omnisearchPeriodSuggestionPeriodRequiretextPeriodMin != null) {
      yield r'omnisearch.suggestion.requiretext.min';
      yield serializers.serialize(
        object.omnisearchPeriodSuggestionPeriodRequiretextPeriodMin,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire != null) {
      yield r'omnisearch.suggestion.spellcheck.require';
      yield serializers.serialize(
        object.omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'omnisearch.suggestion.requiretext.min':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.omnisearchPeriodSuggestionPeriodRequiretextPeriodMin.replace(valueDes);
          break;
        case r'omnisearch.suggestion.spellcheck.require':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder();
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

