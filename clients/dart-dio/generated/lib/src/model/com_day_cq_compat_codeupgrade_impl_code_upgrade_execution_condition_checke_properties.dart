//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties.g.dart';

/// ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties
///
/// Properties:
/// * [codeupgradetasks] 
/// * [codeupgradetaskfilters] 
@BuiltValue()
abstract class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties implements Built<ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties, ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder> {
  @BuiltValueField(wireName: r'codeupgradetasks')
  ConfigNodePropertyArray? get codeupgradetasks;

  @BuiltValueField(wireName: r'codeupgradetaskfilters')
  ConfigNodePropertyArray? get codeupgradetaskfilters;

  ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties._();

  factory ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties([void updates(ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder b)]) = _$ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties> get serializer => _$ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesSerializer();
}

class _$ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesSerializer implements PrimitiveSerializer<ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties, _$ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties];

  @override
  final String wireName = r'ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.codeupgradetasks != null) {
      yield r'codeupgradetasks';
      yield serializers.serialize(
        object.codeupgradetasks,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.codeupgradetaskfilters != null) {
      yield r'codeupgradetaskfilters';
      yield serializers.serialize(
        object.codeupgradetaskfilters,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'codeupgradetasks':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.codeupgradetasks.replace(valueDes);
          break;
        case r'codeupgradetaskfilters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.codeupgradetaskfilters.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder();
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

