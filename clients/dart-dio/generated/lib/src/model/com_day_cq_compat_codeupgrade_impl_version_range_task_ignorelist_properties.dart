//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties.g.dart';

/// ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties
///
/// Properties:
/// * [effectiveBundleListPath] 
@BuiltValue()
abstract class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties implements Built<ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties, ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder> {
  @BuiltValueField(wireName: r'effectiveBundleListPath')
  ConfigNodePropertyString? get effectiveBundleListPath;

  ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties._();

  factory ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties([void updates(ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder b)]) = _$ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties> get serializer => _$ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesSerializer();
}

class _$ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesSerializer implements PrimitiveSerializer<ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties, _$ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties];

  @override
  final String wireName = r'ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.effectiveBundleListPath != null) {
      yield r'effectiveBundleListPath';
      yield serializers.serialize(
        object.effectiveBundleListPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'effectiveBundleListPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.effectiveBundleListPath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder();
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

