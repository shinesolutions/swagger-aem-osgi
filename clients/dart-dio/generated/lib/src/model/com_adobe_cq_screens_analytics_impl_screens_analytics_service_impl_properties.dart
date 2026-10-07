//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties.g.dart';

/// ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties
///
/// Properties:
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodUrl] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodApikey] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodProject] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodEnvironment] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodSendFrequency] 
@BuiltValue()
abstract class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties implements Built<ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties, ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'com.adobe.cq.screens.analytics.impl.url')
  ConfigNodePropertyString? get comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodUrl;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.analytics.impl.apikey')
  ConfigNodePropertyString? get comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodApikey;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.analytics.impl.project')
  ConfigNodePropertyString? get comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodProject;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.analytics.impl.environment')
  ConfigNodePropertyDropDown? get comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodEnvironment;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.analytics.impl.sendFrequency')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodSendFrequency;

  ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties._();

  factory ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties([void updates(ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder b)]) = _$ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties> get serializer => _$ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesSerializer();
}

class _$ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties, _$ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodUrl != null) {
      yield r'com.adobe.cq.screens.analytics.impl.url';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodApikey != null) {
      yield r'com.adobe.cq.screens.analytics.impl.apikey';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodApikey,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodProject != null) {
      yield r'com.adobe.cq.screens.analytics.impl.project';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodProject,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodEnvironment != null) {
      yield r'com.adobe.cq.screens.analytics.impl.environment';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodEnvironment,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodSendFrequency != null) {
      yield r'com.adobe.cq.screens.analytics.impl.sendFrequency';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodSendFrequency,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.adobe.cq.screens.analytics.impl.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodUrl.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.analytics.impl.apikey':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodApikey.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.analytics.impl.project':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodProject.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.analytics.impl.environment':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodEnvironment.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.analytics.impl.sendFrequency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodAnalyticsPeriodImplPeriodSendFrequency.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder();
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

