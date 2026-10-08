//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_msm_impl_actions_page_move_action_factory_properties.g.dart';

/// ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties
///
/// Properties:
/// * [cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes] 
/// * [cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems] 
/// * [cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops] 
/// * [cqPeriodWcmPeriodMsmPeriodImplPeriodActionsPeriodPagemovePeriodPropReferenceUpdate] 
@BuiltValue()
abstract class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties implements Built<ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties, ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.wcm.msm.action.excludednodetypes')
  ConfigNodePropertyArray? get cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes;

  @BuiltValueField(wireName: r'cq.wcm.msm.action.excludedparagraphitems')
  ConfigNodePropertyArray? get cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems;

  @BuiltValueField(wireName: r'cq.wcm.msm.action.excludedprops')
  ConfigNodePropertyArray? get cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops;

  @BuiltValueField(wireName: r'cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate')
  ConfigNodePropertyBoolean? get cqPeriodWcmPeriodMsmPeriodImplPeriodActionsPeriodPagemovePeriodPropReferenceUpdate;

  ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties._();

  factory ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties([void updates(ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder b)]) = _$ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties> get serializer => _$ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesSerializer();
}

class _$ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties, _$ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties];

  @override
  final String wireName = r'ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties object, {
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
    if (object.cqPeriodWcmPeriodMsmPeriodImplPeriodActionsPeriodPagemovePeriodPropReferenceUpdate != null) {
      yield r'cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodMsmPeriodImplPeriodActionsPeriodPagemovePeriodPropReferenceUpdate,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder result,
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
        case r'cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodMsmPeriodImplPeriodActionsPeriodPagemovePeriodPropReferenceUpdate.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesBuilder();
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

