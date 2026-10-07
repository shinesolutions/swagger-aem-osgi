//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_day_cq_wcm_msm_impl_actions_page_move_action_factory_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_msm_impl_actions_page_move_action_factory_info.g.dart';

/// ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo implements Built<ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo, ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties? get properties;

  ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo._();

  factory ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo([void updates(ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder b)]) = _$ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo> get serializer => _$ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoSerializer();
}

class _$ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoSerializer implements PrimitiveSerializer<ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo, _$ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo];

  @override
  final String wireName = r'ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties),
          ) as ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfoBuilder();
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

