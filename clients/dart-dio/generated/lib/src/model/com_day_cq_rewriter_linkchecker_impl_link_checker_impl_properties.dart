//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties.g.dart';

/// ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
///
/// Properties:
/// * [schedulerPeriodPeriod] 
/// * [schedulerPeriodConcurrent] 
/// * [servicePeriodBadLinkToleranceInterval] 
/// * [servicePeriodCheckOverridePatterns] 
/// * [servicePeriodCacheBrokenInternalLinks] 
/// * [servicePeriodSpecialLinkPrefix] 
/// * [servicePeriodSpecialLinkPatterns] 
@BuiltValue()
abstract class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties implements Built<ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties, ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.period')
  ConfigNodePropertyInteger? get schedulerPeriodPeriod;

  @BuiltValueField(wireName: r'scheduler.concurrent')
  ConfigNodePropertyBoolean? get schedulerPeriodConcurrent;

  @BuiltValueField(wireName: r'service.bad_link_tolerance_interval')
  ConfigNodePropertyInteger? get servicePeriodBadLinkToleranceInterval;

  @BuiltValueField(wireName: r'service.check_override_patterns')
  ConfigNodePropertyArray? get servicePeriodCheckOverridePatterns;

  @BuiltValueField(wireName: r'service.cache_broken_internal_links')
  ConfigNodePropertyBoolean? get servicePeriodCacheBrokenInternalLinks;

  @BuiltValueField(wireName: r'service.special_link_prefix')
  ConfigNodePropertyArray? get servicePeriodSpecialLinkPrefix;

  @BuiltValueField(wireName: r'service.special_link_patterns')
  ConfigNodePropertyArray? get servicePeriodSpecialLinkPatterns;

  ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties._();

  factory ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties([void updates(ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder b)]) = _$ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties> get serializer => _$ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesSerializer();
}

class _$ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties, _$ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties];

  @override
  final String wireName = r'ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodPeriod != null) {
      yield r'scheduler.period';
      yield serializers.serialize(
        object.schedulerPeriodPeriod,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.schedulerPeriodConcurrent != null) {
      yield r'scheduler.concurrent';
      yield serializers.serialize(
        object.schedulerPeriodConcurrent,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.servicePeriodBadLinkToleranceInterval != null) {
      yield r'service.bad_link_tolerance_interval';
      yield serializers.serialize(
        object.servicePeriodBadLinkToleranceInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.servicePeriodCheckOverridePatterns != null) {
      yield r'service.check_override_patterns';
      yield serializers.serialize(
        object.servicePeriodCheckOverridePatterns,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.servicePeriodCacheBrokenInternalLinks != null) {
      yield r'service.cache_broken_internal_links';
      yield serializers.serialize(
        object.servicePeriodCacheBrokenInternalLinks,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.servicePeriodSpecialLinkPrefix != null) {
      yield r'service.special_link_prefix';
      yield serializers.serialize(
        object.servicePeriodSpecialLinkPrefix,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.servicePeriodSpecialLinkPatterns != null) {
      yield r'service.special_link_patterns';
      yield serializers.serialize(
        object.servicePeriodSpecialLinkPatterns,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scheduler.period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.schedulerPeriodPeriod.replace(valueDes);
          break;
        case r'scheduler.concurrent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.schedulerPeriodConcurrent.replace(valueDes);
          break;
        case r'service.bad_link_tolerance_interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodBadLinkToleranceInterval.replace(valueDes);
          break;
        case r'service.check_override_patterns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.servicePeriodCheckOverridePatterns.replace(valueDes);
          break;
        case r'service.cache_broken_internal_links':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.servicePeriodCacheBrokenInternalLinks.replace(valueDes);
          break;
        case r'service.special_link_prefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.servicePeriodSpecialLinkPrefix.replace(valueDes);
          break;
        case r'service.special_link_patterns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.servicePeriodSpecialLinkPatterns.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder();
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

