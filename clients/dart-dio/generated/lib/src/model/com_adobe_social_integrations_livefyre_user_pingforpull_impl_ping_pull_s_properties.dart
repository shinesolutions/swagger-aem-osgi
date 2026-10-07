//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties.g.dart';

/// ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties
///
/// Properties:
/// * [communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter] 
@BuiltValue()
abstract class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties implements Built<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties, ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder> {
  @BuiltValueField(wireName: r'communities.integration.livefyre.sling.event.filter')
  ConfigNodePropertyString? get communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter;

  ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties._();

  factory ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties([void updates(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder b)]) = _$ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties> get serializer => _$ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesSerializer();
}

class _$ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesSerializer implements PrimitiveSerializer<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties, _$ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties];

  @override
  final String wireName = r'ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter != null) {
      yield r'communities.integration.livefyre.sling.event.filter';
      yield serializers.serialize(
        object.communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'communities.integration.livefyre.sling.event.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder();
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

