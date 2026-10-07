//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_msm_impl_actions_content_delete_action_factory_properties.g.dart';

/// ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties
///
/// Properties:
/// * [cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes] 
/// * [cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems] 
/// * [cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops] 
@BuiltValue()
abstract class ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties implements Built<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties, ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.wcm.msm.action.excludednodetypes')
  ConfigNodePropertyArray? get cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes;

  @BuiltValueField(wireName: r'cq.wcm.msm.action.excludedparagraphitems')
  ConfigNodePropertyArray? get cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems;

  @BuiltValueField(wireName: r'cq.wcm.msm.action.excludedprops')
  ConfigNodePropertyArray? get cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops;

  ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties._();

  factory ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties([void updates(ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder b)]) = _$ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties> get serializer => _$ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesSerializer();
}

class _$ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties, _$ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties];

  @override
  final String wireName = r'ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes != null) {
      yield r'cq.wcm.msm.action.excludednodetypes';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems != null) {
      yield r'cq.wcm.msm.action.excludedparagraphitems';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops != null) {
      yield r'cq.wcm.msm.action.excludedprops';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.wcm.msm.action.excludednodetypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes.replace(valueDes);
          break;
        case r'cq.wcm.msm.action.excludedparagraphitems':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems.replace(valueDes);
          break;
        case r'cq.wcm.msm.action.excludedprops':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesBuilder();
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

