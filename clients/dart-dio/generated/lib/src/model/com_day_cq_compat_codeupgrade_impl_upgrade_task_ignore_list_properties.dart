//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties.g.dart';

/// ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties
///
/// Properties:
/// * [upgradeTaskIgnoreList] 
@BuiltValue()
abstract class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties implements Built<ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties, ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder> {
  @BuiltValueField(wireName: r'upgradeTaskIgnoreList')
  ConfigNodePropertyArray? get upgradeTaskIgnoreList;

  ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties._();

  factory ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties([void updates(ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder b)]) = _$ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties> get serializer => _$ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesSerializer();
}

class _$ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesSerializer implements PrimitiveSerializer<ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties, _$ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties];

  @override
  final String wireName = r'ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.upgradeTaskIgnoreList != null) {
      yield r'upgradeTaskIgnoreList';
      yield serializers.serialize(
        object.upgradeTaskIgnoreList,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'upgradeTaskIgnoreList':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.upgradeTaskIgnoreList.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder();
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

