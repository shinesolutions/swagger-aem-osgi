//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties.g.dart';

/// ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties
///
/// Properties:
/// * [cqPeriodSocialPeriodConsolePeriodAnalyticsPeriodComponents] 
@BuiltValue()
abstract class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties implements Built<ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties, ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.social.console.analytics.components')
  ConfigNodePropertyArray? get cqPeriodSocialPeriodConsolePeriodAnalyticsPeriodComponents;

  ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties._();

  factory ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties([void updates(ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder b)]) = _$ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties> get serializer => _$ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesSerializer();
}

class _$ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties, _$ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties];

  @override
  final String wireName = r'ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodSocialPeriodConsolePeriodAnalyticsPeriodComponents != null) {
      yield r'cq.social.console.analytics.components';
      yield serializers.serialize(
        object.cqPeriodSocialPeriodConsolePeriodAnalyticsPeriodComponents,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.social.console.analytics.components':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodSocialPeriodConsolePeriodAnalyticsPeriodComponents.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder();
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

