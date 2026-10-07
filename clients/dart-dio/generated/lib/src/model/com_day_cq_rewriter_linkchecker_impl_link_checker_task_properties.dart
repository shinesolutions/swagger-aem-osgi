//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties.g.dart';

/// ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties
///
/// Properties:
/// * [schedulerPeriodPeriod] 
/// * [schedulerPeriodConcurrent] 
/// * [goodLinkTestInterval] 
/// * [badLinkTestInterval] 
/// * [linkUnusedInterval] 
/// * [connectionPeriodTimeout] 
@BuiltValue()
abstract class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties implements Built<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties, ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.period')
  ConfigNodePropertyInteger? get schedulerPeriodPeriod;

  @BuiltValueField(wireName: r'scheduler.concurrent')
  ConfigNodePropertyBoolean? get schedulerPeriodConcurrent;

  @BuiltValueField(wireName: r'good_link_test_interval')
  ConfigNodePropertyInteger? get goodLinkTestInterval;

  @BuiltValueField(wireName: r'bad_link_test_interval')
  ConfigNodePropertyInteger? get badLinkTestInterval;

  @BuiltValueField(wireName: r'link_unused_interval')
  ConfigNodePropertyInteger? get linkUnusedInterval;

  @BuiltValueField(wireName: r'connection.timeout')
  ConfigNodePropertyInteger? get connectionPeriodTimeout;

  ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties._();

  factory ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties([void updates(ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder b)]) = _$ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties> get serializer => _$ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesSerializer();
}

class _$ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesSerializer implements PrimitiveSerializer<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties, _$ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties];

  @override
  final String wireName = r'ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties object, {
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
    if (object.goodLinkTestInterval != null) {
      yield r'good_link_test_interval';
      yield serializers.serialize(
        object.goodLinkTestInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.badLinkTestInterval != null) {
      yield r'bad_link_test_interval';
      yield serializers.serialize(
        object.badLinkTestInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.linkUnusedInterval != null) {
      yield r'link_unused_interval';
      yield serializers.serialize(
        object.linkUnusedInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.connectionPeriodTimeout != null) {
      yield r'connection.timeout';
      yield serializers.serialize(
        object.connectionPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder result,
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
        case r'good_link_test_interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.goodLinkTestInterval.replace(valueDes);
          break;
        case r'bad_link_test_interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.badLinkTestInterval.replace(valueDes);
          break;
        case r'link_unused_interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.linkUnusedInterval.replace(valueDes);
          break;
        case r'connection.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.connectionPeriodTimeout.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder();
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

