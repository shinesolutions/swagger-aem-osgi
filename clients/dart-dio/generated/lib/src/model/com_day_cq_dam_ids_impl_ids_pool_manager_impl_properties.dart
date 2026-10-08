//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties.g.dart';

/// ComDayCqDamIdsImplIDSPoolManagerImplProperties
///
/// Properties:
/// * [maxPeriodErrorsPeriodToPeriodBlacklist] 
/// * [retryPeriodIntervalPeriodToPeriodWhitelist] 
/// * [connectPeriodTimeout] 
/// * [socketPeriodTimeout] 
/// * [processPeriodLabel] 
/// * [connectionPeriodUsePeriodMax] 
@BuiltValue()
abstract class ComDayCqDamIdsImplIDSPoolManagerImplProperties implements Built<ComDayCqDamIdsImplIDSPoolManagerImplProperties, ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'max.errors.to.blacklist')
  ConfigNodePropertyInteger? get maxPeriodErrorsPeriodToPeriodBlacklist;

  @BuiltValueField(wireName: r'retry.interval.to.whitelist')
  ConfigNodePropertyInteger? get retryPeriodIntervalPeriodToPeriodWhitelist;

  @BuiltValueField(wireName: r'connect.timeout')
  ConfigNodePropertyInteger? get connectPeriodTimeout;

  @BuiltValueField(wireName: r'socket.timeout')
  ConfigNodePropertyInteger? get socketPeriodTimeout;

  @BuiltValueField(wireName: r'process.label')
  ConfigNodePropertyString? get processPeriodLabel;

  @BuiltValueField(wireName: r'connection.use.max')
  ConfigNodePropertyInteger? get connectionPeriodUsePeriodMax;

  ComDayCqDamIdsImplIDSPoolManagerImplProperties._();

  factory ComDayCqDamIdsImplIDSPoolManagerImplProperties([void updates(ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder b)]) = _$ComDayCqDamIdsImplIDSPoolManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamIdsImplIDSPoolManagerImplProperties> get serializer => _$ComDayCqDamIdsImplIDSPoolManagerImplPropertiesSerializer();
}

class _$ComDayCqDamIdsImplIDSPoolManagerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamIdsImplIDSPoolManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamIdsImplIDSPoolManagerImplProperties, _$ComDayCqDamIdsImplIDSPoolManagerImplProperties];

  @override
  final String wireName = r'ComDayCqDamIdsImplIDSPoolManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamIdsImplIDSPoolManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxPeriodErrorsPeriodToPeriodBlacklist != null) {
      yield r'max.errors.to.blacklist';
      yield serializers.serialize(
        object.maxPeriodErrorsPeriodToPeriodBlacklist,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.retryPeriodIntervalPeriodToPeriodWhitelist != null) {
      yield r'retry.interval.to.whitelist';
      yield serializers.serialize(
        object.retryPeriodIntervalPeriodToPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.connectPeriodTimeout != null) {
      yield r'connect.timeout';
      yield serializers.serialize(
        object.connectPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.socketPeriodTimeout != null) {
      yield r'socket.timeout';
      yield serializers.serialize(
        object.socketPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.processPeriodLabel != null) {
      yield r'process.label';
      yield serializers.serialize(
        object.processPeriodLabel,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.connectionPeriodUsePeriodMax != null) {
      yield r'connection.use.max';
      yield serializers.serialize(
        object.connectionPeriodUsePeriodMax,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamIdsImplIDSPoolManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max.errors.to.blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPeriodErrorsPeriodToPeriodBlacklist.replace(valueDes);
          break;
        case r'retry.interval.to.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.retryPeriodIntervalPeriodToPeriodWhitelist.replace(valueDes);
          break;
        case r'connect.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.connectPeriodTimeout.replace(valueDes);
          break;
        case r'socket.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.socketPeriodTimeout.replace(valueDes);
          break;
        case r'process.label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.processPeriodLabel.replace(valueDes);
          break;
        case r'connection.use.max':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.connectionPeriodUsePeriodMax.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamIdsImplIDSPoolManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder();
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

