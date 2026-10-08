//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_handlebars_guava_template_cache_impl_properties.g.dart';

/// ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties
///
/// Properties:
/// * [parameterPeriodGuavaPeriodCachePeriodEnabled] 
/// * [parameterPeriodGuavaPeriodCachePeriodParams] 
/// * [parameterPeriodGuavaPeriodCachePeriodReload] 
/// * [servicePeriodRanking] 
@BuiltValue()
abstract class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties implements Built<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties, ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'parameter.guava.cache.enabled')
  ConfigNodePropertyBoolean? get parameterPeriodGuavaPeriodCachePeriodEnabled;

  @BuiltValueField(wireName: r'parameter.guava.cache.params')
  ConfigNodePropertyString? get parameterPeriodGuavaPeriodCachePeriodParams;

  @BuiltValueField(wireName: r'parameter.guava.cache.reload')
  ConfigNodePropertyBoolean? get parameterPeriodGuavaPeriodCachePeriodReload;

  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties._();

  factory ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties([void updates(ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder b)]) = _$ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties> get serializer => _$ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesSerializer();
}

class _$ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties, _$ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.parameterPeriodGuavaPeriodCachePeriodEnabled != null) {
      yield r'parameter.guava.cache.enabled';
      yield serializers.serialize(
        object.parameterPeriodGuavaPeriodCachePeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.parameterPeriodGuavaPeriodCachePeriodParams != null) {
      yield r'parameter.guava.cache.params';
      yield serializers.serialize(
        object.parameterPeriodGuavaPeriodCachePeriodParams,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.parameterPeriodGuavaPeriodCachePeriodReload != null) {
      yield r'parameter.guava.cache.reload';
      yield serializers.serialize(
        object.parameterPeriodGuavaPeriodCachePeriodReload,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'parameter.guava.cache.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.parameterPeriodGuavaPeriodCachePeriodEnabled.replace(valueDes);
          break;
        case r'parameter.guava.cache.params':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.parameterPeriodGuavaPeriodCachePeriodParams.replace(valueDes);
          break;
        case r'parameter.guava.cache.reload':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.parameterPeriodGuavaPeriodCachePeriodReload.replace(valueDes);
          break;
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder();
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

