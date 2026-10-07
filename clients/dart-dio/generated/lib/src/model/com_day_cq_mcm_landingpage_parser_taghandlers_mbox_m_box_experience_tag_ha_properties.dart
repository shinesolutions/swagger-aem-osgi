//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_properties.g.dart';

/// ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [tagpattern] 
@BuiltValue()
abstract class ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties implements Built<ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties, ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'tagpattern')
  ConfigNodePropertyString? get tagpattern;

  ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties._();

  factory ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties([void updates(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder b)]) = _$ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties> get serializer => _$ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesSerializer();
}

class _$ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesSerializer implements PrimitiveSerializer<ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties, _$ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties];

  @override
  final String wireName = r'ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.tagpattern != null) {
      yield r'tagpattern';
      yield serializers.serialize(
        object.tagpattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        case r'tagpattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.tagpattern.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder();
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

