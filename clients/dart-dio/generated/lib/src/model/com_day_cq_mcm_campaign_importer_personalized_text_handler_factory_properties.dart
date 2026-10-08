//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_mcm_campaign_importer_personalized_text_handler_factory_properties.g.dart';

/// ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [tagpattern] 
@BuiltValue()
abstract class ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties implements Built<ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties, ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'tagpattern')
  ConfigNodePropertyString? get tagpattern;

  ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties._();

  factory ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties([void updates(ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder b)]) = _$ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties> get serializer => _$ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesSerializer();
}

class _$ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesSerializer implements PrimitiveSerializer<ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties, _$ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties];

  @override
  final String wireName = r'ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties object, {
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
    ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder result,
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
  ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder();
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

