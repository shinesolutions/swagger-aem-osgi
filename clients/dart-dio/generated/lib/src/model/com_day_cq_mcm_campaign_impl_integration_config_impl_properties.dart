//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_mcm_campaign_impl_integration_config_impl_properties.g.dart';

/// ComDayCqMcmCampaignImplIntegrationConfigImplProperties
///
/// Properties:
/// * [aemPeriodMcmPeriodCampaignPeriodFormConstraints] 
/// * [aemPeriodMcmPeriodCampaignPeriodPublicUrl] 
/// * [aemPeriodMcmPeriodCampaignPeriodRelaxedSSL] 
@BuiltValue()
abstract class ComDayCqMcmCampaignImplIntegrationConfigImplProperties implements Built<ComDayCqMcmCampaignImplIntegrationConfigImplProperties, ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'aem.mcm.campaign.formConstraints')
  ConfigNodePropertyArray? get aemPeriodMcmPeriodCampaignPeriodFormConstraints;

  @BuiltValueField(wireName: r'aem.mcm.campaign.publicUrl')
  ConfigNodePropertyString? get aemPeriodMcmPeriodCampaignPeriodPublicUrl;

  @BuiltValueField(wireName: r'aem.mcm.campaign.relaxedSSL')
  ConfigNodePropertyBoolean? get aemPeriodMcmPeriodCampaignPeriodRelaxedSSL;

  ComDayCqMcmCampaignImplIntegrationConfigImplProperties._();

  factory ComDayCqMcmCampaignImplIntegrationConfigImplProperties([void updates(ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder b)]) = _$ComDayCqMcmCampaignImplIntegrationConfigImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqMcmCampaignImplIntegrationConfigImplProperties> get serializer => _$ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesSerializer();
}

class _$ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqMcmCampaignImplIntegrationConfigImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqMcmCampaignImplIntegrationConfigImplProperties, _$ComDayCqMcmCampaignImplIntegrationConfigImplProperties];

  @override
  final String wireName = r'ComDayCqMcmCampaignImplIntegrationConfigImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqMcmCampaignImplIntegrationConfigImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.aemPeriodMcmPeriodCampaignPeriodFormConstraints != null) {
      yield r'aem.mcm.campaign.formConstraints';
      yield serializers.serialize(
        object.aemPeriodMcmPeriodCampaignPeriodFormConstraints,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.aemPeriodMcmPeriodCampaignPeriodPublicUrl != null) {
      yield r'aem.mcm.campaign.publicUrl';
      yield serializers.serialize(
        object.aemPeriodMcmPeriodCampaignPeriodPublicUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.aemPeriodMcmPeriodCampaignPeriodRelaxedSSL != null) {
      yield r'aem.mcm.campaign.relaxedSSL';
      yield serializers.serialize(
        object.aemPeriodMcmPeriodCampaignPeriodRelaxedSSL,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqMcmCampaignImplIntegrationConfigImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'aem.mcm.campaign.formConstraints':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.aemPeriodMcmPeriodCampaignPeriodFormConstraints.replace(valueDes);
          break;
        case r'aem.mcm.campaign.publicUrl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.aemPeriodMcmPeriodCampaignPeriodPublicUrl.replace(valueDes);
          break;
        case r'aem.mcm.campaign.relaxedSSL':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.aemPeriodMcmPeriodCampaignPeriodRelaxedSSL.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqMcmCampaignImplIntegrationConfigImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqMcmCampaignImplIntegrationConfigImplPropertiesBuilder();
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

