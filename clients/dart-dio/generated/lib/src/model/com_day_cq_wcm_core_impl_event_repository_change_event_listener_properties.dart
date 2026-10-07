//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties.g.dart';

/// ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties
///
/// Properties:
/// * [paths] 
/// * [excludedPaths] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties implements Built<ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties, ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'paths')
  ConfigNodePropertyArray? get paths;

  @BuiltValueField(wireName: r'excludedPaths')
  ConfigNodePropertyArray? get excludedPaths;

  ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties._();

  factory ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties([void updates(ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties> get serializer => _$ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties, _$ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.paths != null) {
      yield r'paths';
      yield serializers.serialize(
        object.paths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.excludedPaths != null) {
      yield r'excludedPaths';
      yield serializers.serialize(
        object.excludedPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.paths.replace(valueDes);
          break;
        case r'excludedPaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.excludedPaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder();
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

