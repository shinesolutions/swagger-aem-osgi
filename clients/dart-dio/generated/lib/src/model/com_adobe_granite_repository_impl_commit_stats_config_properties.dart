//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_repository_impl_commit_stats_config_properties.g.dart';

/// ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
///
/// Properties:
/// * [enabled] 
/// * [intervalSeconds] 
/// * [commitsPerIntervalThreshold] 
/// * [maxLocationLength] 
/// * [maxDetailsShown] 
/// * [minDetailsPercentage] 
/// * [threadMatchers] 
/// * [maxGreedyDepth] 
/// * [greedyStackMatchers] 
/// * [stackFilters] 
/// * [stackMatchers] 
/// * [stackCategorizers] 
/// * [stackShorteners] 
@BuiltValue()
abstract class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties implements Built<ComAdobeGraniteRepositoryImplCommitStatsConfigProperties, ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'intervalSeconds')
  ConfigNodePropertyInteger? get intervalSeconds;

  @BuiltValueField(wireName: r'commitsPerIntervalThreshold')
  ConfigNodePropertyInteger? get commitsPerIntervalThreshold;

  @BuiltValueField(wireName: r'maxLocationLength')
  ConfigNodePropertyInteger? get maxLocationLength;

  @BuiltValueField(wireName: r'maxDetailsShown')
  ConfigNodePropertyInteger? get maxDetailsShown;

  @BuiltValueField(wireName: r'minDetailsPercentage')
  ConfigNodePropertyInteger? get minDetailsPercentage;

  @BuiltValueField(wireName: r'threadMatchers')
  ConfigNodePropertyArray? get threadMatchers;

  @BuiltValueField(wireName: r'maxGreedyDepth')
  ConfigNodePropertyInteger? get maxGreedyDepth;

  @BuiltValueField(wireName: r'greedyStackMatchers')
  ConfigNodePropertyString? get greedyStackMatchers;

  @BuiltValueField(wireName: r'stackFilters')
  ConfigNodePropertyArray? get stackFilters;

  @BuiltValueField(wireName: r'stackMatchers')
  ConfigNodePropertyArray? get stackMatchers;

  @BuiltValueField(wireName: r'stackCategorizers')
  ConfigNodePropertyArray? get stackCategorizers;

  @BuiltValueField(wireName: r'stackShorteners')
  ConfigNodePropertyArray? get stackShorteners;

  ComAdobeGraniteRepositoryImplCommitStatsConfigProperties._();

  factory ComAdobeGraniteRepositoryImplCommitStatsConfigProperties([void updates(ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder b)]) = _$ComAdobeGraniteRepositoryImplCommitStatsConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteRepositoryImplCommitStatsConfigProperties> get serializer => _$ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesSerializer();
}

class _$ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteRepositoryImplCommitStatsConfigProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteRepositoryImplCommitStatsConfigProperties, _$ComAdobeGraniteRepositoryImplCommitStatsConfigProperties];

  @override
  final String wireName = r'ComAdobeGraniteRepositoryImplCommitStatsConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteRepositoryImplCommitStatsConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.intervalSeconds != null) {
      yield r'intervalSeconds';
      yield serializers.serialize(
        object.intervalSeconds,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.commitsPerIntervalThreshold != null) {
      yield r'commitsPerIntervalThreshold';
      yield serializers.serialize(
        object.commitsPerIntervalThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxLocationLength != null) {
      yield r'maxLocationLength';
      yield serializers.serialize(
        object.maxLocationLength,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxDetailsShown != null) {
      yield r'maxDetailsShown';
      yield serializers.serialize(
        object.maxDetailsShown,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.minDetailsPercentage != null) {
      yield r'minDetailsPercentage';
      yield serializers.serialize(
        object.minDetailsPercentage,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.threadMatchers != null) {
      yield r'threadMatchers';
      yield serializers.serialize(
        object.threadMatchers,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.maxGreedyDepth != null) {
      yield r'maxGreedyDepth';
      yield serializers.serialize(
        object.maxGreedyDepth,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.greedyStackMatchers != null) {
      yield r'greedyStackMatchers';
      yield serializers.serialize(
        object.greedyStackMatchers,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.stackFilters != null) {
      yield r'stackFilters';
      yield serializers.serialize(
        object.stackFilters,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.stackMatchers != null) {
      yield r'stackMatchers';
      yield serializers.serialize(
        object.stackMatchers,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.stackCategorizers != null) {
      yield r'stackCategorizers';
      yield serializers.serialize(
        object.stackCategorizers,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.stackShorteners != null) {
      yield r'stackShorteners';
      yield serializers.serialize(
        object.stackShorteners,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteRepositoryImplCommitStatsConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'intervalSeconds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.intervalSeconds.replace(valueDes);
          break;
        case r'commitsPerIntervalThreshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.commitsPerIntervalThreshold.replace(valueDes);
          break;
        case r'maxLocationLength':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxLocationLength.replace(valueDes);
          break;
        case r'maxDetailsShown':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxDetailsShown.replace(valueDes);
          break;
        case r'minDetailsPercentage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minDetailsPercentage.replace(valueDes);
          break;
        case r'threadMatchers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.threadMatchers.replace(valueDes);
          break;
        case r'maxGreedyDepth':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxGreedyDepth.replace(valueDes);
          break;
        case r'greedyStackMatchers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.greedyStackMatchers.replace(valueDes);
          break;
        case r'stackFilters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.stackFilters.replace(valueDes);
          break;
        case r'stackMatchers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.stackMatchers.replace(valueDes);
          break;
        case r'stackCategorizers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.stackCategorizers.replace(valueDes);
          break;
        case r'stackShorteners':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.stackShorteners.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteRepositoryImplCommitStatsConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder();
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

