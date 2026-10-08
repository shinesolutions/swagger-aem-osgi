//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties.g.dart';

/// ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties
///
/// Properties:
/// * [liverelationshipmgrPeriodRelationsconfigPeriodDefault] 
@BuiltValue()
abstract class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties implements Built<ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties, ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'liverelationshipmgr.relationsconfig.default')
  ConfigNodePropertyString? get liverelationshipmgrPeriodRelationsconfigPeriodDefault;

  ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties._();

  factory ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties([void updates(ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder b)]) = _$ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties> get serializer => _$ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesSerializer();
}

class _$ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties, _$ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties];

  @override
  final String wireName = r'ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.liverelationshipmgrPeriodRelationsconfigPeriodDefault != null) {
      yield r'liverelationshipmgr.relationsconfig.default';
      yield serializers.serialize(
        object.liverelationshipmgrPeriodRelationsconfigPeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'liverelationshipmgr.relationsconfig.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.liverelationshipmgrPeriodRelationsconfigPeriodDefault.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesBuilder();
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

