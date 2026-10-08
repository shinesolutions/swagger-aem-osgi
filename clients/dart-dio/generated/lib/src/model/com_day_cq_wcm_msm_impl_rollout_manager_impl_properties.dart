//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_msm_impl_rollout_manager_impl_properties.g.dart';

/// ComDayCqWcmMsmImplRolloutManagerImplProperties
///
/// Properties:
/// * [eventPeriodFilter] 
/// * [rolloutmgrPeriodExcludedpropsPeriodDefault] 
/// * [rolloutmgrPeriodExcludedparagraphpropsPeriodDefault] 
/// * [rolloutmgrPeriodExcludednodetypesPeriodDefault] 
/// * [rolloutmgrPeriodThreadpoolPeriodMaxsize] 
/// * [rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime] 
/// * [rolloutmgrPeriodThreadpoolPeriodPriority] 
/// * [rolloutmgrPeriodCommitPeriodSize] 
/// * [rolloutmgrPeriodConflicthandlingPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqWcmMsmImplRolloutManagerImplProperties implements Built<ComDayCqWcmMsmImplRolloutManagerImplProperties, ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  @BuiltValueField(wireName: r'rolloutmgr.excludedprops.default')
  ConfigNodePropertyArray? get rolloutmgrPeriodExcludedpropsPeriodDefault;

  @BuiltValueField(wireName: r'rolloutmgr.excludedparagraphprops.default')
  ConfigNodePropertyArray? get rolloutmgrPeriodExcludedparagraphpropsPeriodDefault;

  @BuiltValueField(wireName: r'rolloutmgr.excludednodetypes.default')
  ConfigNodePropertyArray? get rolloutmgrPeriodExcludednodetypesPeriodDefault;

  @BuiltValueField(wireName: r'rolloutmgr.threadpool.maxsize')
  ConfigNodePropertyInteger? get rolloutmgrPeriodThreadpoolPeriodMaxsize;

  @BuiltValueField(wireName: r'rolloutmgr.threadpool.maxshutdowntime')
  ConfigNodePropertyInteger? get rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime;

  @BuiltValueField(wireName: r'rolloutmgr.threadpool.priority')
  ConfigNodePropertyDropDown? get rolloutmgrPeriodThreadpoolPeriodPriority;

  @BuiltValueField(wireName: r'rolloutmgr.commit.size')
  ConfigNodePropertyInteger? get rolloutmgrPeriodCommitPeriodSize;

  @BuiltValueField(wireName: r'rolloutmgr.conflicthandling.enabled')
  ConfigNodePropertyBoolean? get rolloutmgrPeriodConflicthandlingPeriodEnabled;

  ComDayCqWcmMsmImplRolloutManagerImplProperties._();

  factory ComDayCqWcmMsmImplRolloutManagerImplProperties([void updates(ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder b)]) = _$ComDayCqWcmMsmImplRolloutManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmMsmImplRolloutManagerImplProperties> get serializer => _$ComDayCqWcmMsmImplRolloutManagerImplPropertiesSerializer();
}

class _$ComDayCqWcmMsmImplRolloutManagerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmMsmImplRolloutManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmMsmImplRolloutManagerImplProperties, _$ComDayCqWcmMsmImplRolloutManagerImplProperties];

  @override
  final String wireName = r'ComDayCqWcmMsmImplRolloutManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmMsmImplRolloutManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventPeriodFilter != null) {
      yield r'event.filter';
      yield serializers.serialize(
        object.eventPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.rolloutmgrPeriodExcludedpropsPeriodDefault != null) {
      yield r'rolloutmgr.excludedprops.default';
      yield serializers.serialize(
        object.rolloutmgrPeriodExcludedpropsPeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.rolloutmgrPeriodExcludedparagraphpropsPeriodDefault != null) {
      yield r'rolloutmgr.excludedparagraphprops.default';
      yield serializers.serialize(
        object.rolloutmgrPeriodExcludedparagraphpropsPeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.rolloutmgrPeriodExcludednodetypesPeriodDefault != null) {
      yield r'rolloutmgr.excludednodetypes.default';
      yield serializers.serialize(
        object.rolloutmgrPeriodExcludednodetypesPeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.rolloutmgrPeriodThreadpoolPeriodMaxsize != null) {
      yield r'rolloutmgr.threadpool.maxsize';
      yield serializers.serialize(
        object.rolloutmgrPeriodThreadpoolPeriodMaxsize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime != null) {
      yield r'rolloutmgr.threadpool.maxshutdowntime';
      yield serializers.serialize(
        object.rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.rolloutmgrPeriodThreadpoolPeriodPriority != null) {
      yield r'rolloutmgr.threadpool.priority';
      yield serializers.serialize(
        object.rolloutmgrPeriodThreadpoolPeriodPriority,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.rolloutmgrPeriodCommitPeriodSize != null) {
      yield r'rolloutmgr.commit.size';
      yield serializers.serialize(
        object.rolloutmgrPeriodCommitPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.rolloutmgrPeriodConflicthandlingPeriodEnabled != null) {
      yield r'rolloutmgr.conflicthandling.enabled';
      yield serializers.serialize(
        object.rolloutmgrPeriodConflicthandlingPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmMsmImplRolloutManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.eventPeriodFilter.replace(valueDes);
          break;
        case r'rolloutmgr.excludedprops.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.rolloutmgrPeriodExcludedpropsPeriodDefault.replace(valueDes);
          break;
        case r'rolloutmgr.excludedparagraphprops.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.rolloutmgrPeriodExcludedparagraphpropsPeriodDefault.replace(valueDes);
          break;
        case r'rolloutmgr.excludednodetypes.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.rolloutmgrPeriodExcludednodetypesPeriodDefault.replace(valueDes);
          break;
        case r'rolloutmgr.threadpool.maxsize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.rolloutmgrPeriodThreadpoolPeriodMaxsize.replace(valueDes);
          break;
        case r'rolloutmgr.threadpool.maxshutdowntime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime.replace(valueDes);
          break;
        case r'rolloutmgr.threadpool.priority':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.rolloutmgrPeriodThreadpoolPeriodPriority.replace(valueDes);
          break;
        case r'rolloutmgr.commit.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.rolloutmgrPeriodCommitPeriodSize.replace(valueDes);
          break;
        case r'rolloutmgr.conflicthandling.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.rolloutmgrPeriodConflicthandlingPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmMsmImplRolloutManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmMsmImplRolloutManagerImplPropertiesBuilder();
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

