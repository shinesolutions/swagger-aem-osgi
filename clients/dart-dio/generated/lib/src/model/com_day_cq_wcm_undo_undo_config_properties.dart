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

part 'com_day_cq_wcm_undo_undo_config_properties.g.dart';

/// ComDayCqWcmUndoUndoConfigProperties
///
/// Properties:
/// * [cqPeriodWcmPeriodUndoPeriodEnabled] 
/// * [cqPeriodWcmPeriodUndoPeriodPath] 
/// * [cqPeriodWcmPeriodUndoPeriodValidity] 
/// * [cqPeriodWcmPeriodUndoPeriodSteps] 
/// * [cqPeriodWcmPeriodUndoPeriodPersistence] 
/// * [cqPeriodWcmPeriodUndoPeriodPersistencePeriodMode] 
/// * [cqPeriodWcmPeriodUndoPeriodMarkermode] 
/// * [cqPeriodWcmPeriodUndoPeriodWhitelist] 
/// * [cqPeriodWcmPeriodUndoPeriodBlacklist] 
@BuiltValue()
abstract class ComDayCqWcmUndoUndoConfigProperties implements Built<ComDayCqWcmUndoUndoConfigProperties, ComDayCqWcmUndoUndoConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.wcm.undo.enabled')
  ConfigNodePropertyBoolean? get cqPeriodWcmPeriodUndoPeriodEnabled;

  @BuiltValueField(wireName: r'cq.wcm.undo.path')
  ConfigNodePropertyString? get cqPeriodWcmPeriodUndoPeriodPath;

  @BuiltValueField(wireName: r'cq.wcm.undo.validity')
  ConfigNodePropertyInteger? get cqPeriodWcmPeriodUndoPeriodValidity;

  @BuiltValueField(wireName: r'cq.wcm.undo.steps')
  ConfigNodePropertyInteger? get cqPeriodWcmPeriodUndoPeriodSteps;

  @BuiltValueField(wireName: r'cq.wcm.undo.persistence')
  ConfigNodePropertyString? get cqPeriodWcmPeriodUndoPeriodPersistence;

  @BuiltValueField(wireName: r'cq.wcm.undo.persistence.mode')
  ConfigNodePropertyBoolean? get cqPeriodWcmPeriodUndoPeriodPersistencePeriodMode;

  @BuiltValueField(wireName: r'cq.wcm.undo.markermode')
  ConfigNodePropertyString? get cqPeriodWcmPeriodUndoPeriodMarkermode;

  @BuiltValueField(wireName: r'cq.wcm.undo.whitelist')
  ConfigNodePropertyArray? get cqPeriodWcmPeriodUndoPeriodWhitelist;

  @BuiltValueField(wireName: r'cq.wcm.undo.blacklist')
  ConfigNodePropertyArray? get cqPeriodWcmPeriodUndoPeriodBlacklist;

  ComDayCqWcmUndoUndoConfigProperties._();

  factory ComDayCqWcmUndoUndoConfigProperties([void updates(ComDayCqWcmUndoUndoConfigPropertiesBuilder b)]) = _$ComDayCqWcmUndoUndoConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmUndoUndoConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmUndoUndoConfigProperties> get serializer => _$ComDayCqWcmUndoUndoConfigPropertiesSerializer();
}

class _$ComDayCqWcmUndoUndoConfigPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmUndoUndoConfigProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmUndoUndoConfigProperties, _$ComDayCqWcmUndoUndoConfigProperties];

  @override
  final String wireName = r'ComDayCqWcmUndoUndoConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmUndoUndoConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodWcmPeriodUndoPeriodEnabled != null) {
      yield r'cq.wcm.undo.enabled';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodUndoPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodWcmPeriodUndoPeriodPath != null) {
      yield r'cq.wcm.undo.path';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodUndoPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodWcmPeriodUndoPeriodValidity != null) {
      yield r'cq.wcm.undo.validity';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodUndoPeriodValidity,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodWcmPeriodUndoPeriodSteps != null) {
      yield r'cq.wcm.undo.steps';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodUndoPeriodSteps,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodWcmPeriodUndoPeriodPersistence != null) {
      yield r'cq.wcm.undo.persistence';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodUndoPeriodPersistence,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodWcmPeriodUndoPeriodPersistencePeriodMode != null) {
      yield r'cq.wcm.undo.persistence.mode';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodUndoPeriodPersistencePeriodMode,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodWcmPeriodUndoPeriodMarkermode != null) {
      yield r'cq.wcm.undo.markermode';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodUndoPeriodMarkermode,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodWcmPeriodUndoPeriodWhitelist != null) {
      yield r'cq.wcm.undo.whitelist';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodUndoPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodWcmPeriodUndoPeriodBlacklist != null) {
      yield r'cq.wcm.undo.blacklist';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodUndoPeriodBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmUndoUndoConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmUndoUndoConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.wcm.undo.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodUndoPeriodEnabled.replace(valueDes);
          break;
        case r'cq.wcm.undo.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodUndoPeriodPath.replace(valueDes);
          break;
        case r'cq.wcm.undo.validity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodUndoPeriodValidity.replace(valueDes);
          break;
        case r'cq.wcm.undo.steps':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodUndoPeriodSteps.replace(valueDes);
          break;
        case r'cq.wcm.undo.persistence':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodUndoPeriodPersistence.replace(valueDes);
          break;
        case r'cq.wcm.undo.persistence.mode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodUndoPeriodPersistencePeriodMode.replace(valueDes);
          break;
        case r'cq.wcm.undo.markermode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodUndoPeriodMarkermode.replace(valueDes);
          break;
        case r'cq.wcm.undo.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodUndoPeriodWhitelist.replace(valueDes);
          break;
        case r'cq.wcm.undo.blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodUndoPeriodBlacklist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmUndoUndoConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmUndoUndoConfigPropertiesBuilder();
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

